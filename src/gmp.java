import javax.annotation.Nullable;

public record gmp(String f, @Nullable gpn g) {
   public static final gmp a = new gmp("TERRAIN_SHEET", gpn.B(hhy.d));
   public static final gmp b = new gmp("PARTICLE_SHEET_OPAQUE", gpn.A(hhy.e));
   public static final gmp c = new gmp("PARTICLE_SHEET_TRANSLUCENT", gpn.B(hhy.e));
   public static final gmp d = new gmp("CUSTOM", null);
   public static final gmp e = new gmp("NO_RENDER", null);

   public String a() {
      return this.f;
   }

   @Nullable
   public gpn b() {
      return this.g;
   }
}
