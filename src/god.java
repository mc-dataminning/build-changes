import javax.annotation.Nullable;

public record god(String f, @Nullable grc g) {
   public static final god a = new god("TERRAIN_SHEET", grc.B(hjp.c));
   public static final god b = new god("PARTICLE_SHEET_OPAQUE", grc.A(hjp.d));
   public static final god c = new god("PARTICLE_SHEET_TRANSLUCENT", grc.B(hjp.d));
   public static final god d = new god("CUSTOM", null);
   public static final god e = new god("NO_RENDER", null);

   public String a() {
      return this.f;
   }

   @Nullable
   public grc b() {
      return this.g;
   }
}
