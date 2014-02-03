package com.dgz.tracking.process;

import org.bson.types.ObjectId;
import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;
import org.springframework.stereotype.Component;

import com.mongodb.DBObject;
import com.mongodb.WriteConcern;
import com.mongodb.util.JSON;

@Component
public class InsertMongoComponent extends AbstractMongoComponent implements Callable {
	
	public InsertMongoComponent() {
		
	}

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		
		Object payload = eventContext.getMessage().getPayload();  
		
		DBObject thedata = (DBObject) JSON.parse((String) payload);  
		
//		db.getDB(getDbName()).getCollection("mycollection").insert(thedata, WriteConcern.SAFE);  
		db.getDB(getDbName()).getCollection(collectionName).insert(thedata, WriteConcern.SAFE);  
		
		ObjectId id = (ObjectId) thedata.get("_id");  
	    
		if (id == null) return null;  
	    
		return id.toStringMongod();  
		
		
	}

}
