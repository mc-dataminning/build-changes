import javax.annotation.Nullable;

public record gji(String f, @Nullable gmf g) {
   public static final gji a = new gji("TERRAIN_SHEET", gmf.B(hel.d));
   public static final gji b = new gji("PARTICLE_SHEET_OPAQUE", gmf.A(hel.e));
   public static final gji c = new gji("PARTICLE_SHEET_TRANSLUCENT", gmf.B(hel.e));
   public static final gji d = new gji("CUSTOM", null);
   public static final gji e = new gji("NO_RENDER", null);

   public String a() {
      return this.f;
   }

   @Nullable
   public gmf b() {
      return this.g;
   }
}
