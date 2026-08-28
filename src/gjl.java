import javax.annotation.Nullable;

public record gjl(String f, @Nullable gmi g) {
   public static final gjl a = new gjl("TERRAIN_SHEET", gmi.B(her.d));
   public static final gjl b = new gjl("PARTICLE_SHEET_OPAQUE", gmi.A(her.e));
   public static final gjl c = new gjl("PARTICLE_SHEET_TRANSLUCENT", gmi.B(her.e));
   public static final gjl d = new gjl("CUSTOM", null);
   public static final gjl e = new gjl("NO_RENDER", null);

   public String a() {
      return this.f;
   }

   @Nullable
   public gmi b() {
      return this.g;
   }
}
