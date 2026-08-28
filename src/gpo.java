import javax.annotation.Nullable;

public record gpo(String f, @Nullable gsl g) {
   public static final gpo a = new gpo("TERRAIN_SHEET", gsl.B(hkz.c));
   public static final gpo b = new gpo("PARTICLE_SHEET_OPAQUE", gsl.A(hkz.d));
   public static final gpo c = new gpo("PARTICLE_SHEET_TRANSLUCENT", gsl.B(hkz.d));
   public static final gpo d = new gpo("CUSTOM", null);
   public static final gpo e = new gpo("NO_RENDER", null);

   public String a() {
      return this.f;
   }

   @Nullable
   public gsl b() {
      return this.g;
   }
}
