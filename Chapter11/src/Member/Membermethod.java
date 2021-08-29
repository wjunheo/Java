package Member;

public class Membermethod {
	public String id;
	
@Override
public boolean equals(Object obj) {
if (obj instanceof Membermethod ) {
	Membermethod member=(Membermethod) obj;
	if(id.equals(member.id)) {
		return true;
	}
}
return false;
}
}
