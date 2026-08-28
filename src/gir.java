import javax.annotation.Nullable;

public record gir(String f, @Nullable glq g) {
   public static final gir a = new gir("TERRAIN_SHEET", glq.B(hbf.d));
   public static final gir b = new gir("PARTICLE_SHEET_OPAQUE", glq.A(hbf.e));
   public static final gir c = new gir("PARTICLE_SHEET_TRANSLUCENT", glq.B(hbf.e));
   public static final gir d = new gir("CUSTOM", null);
   public static final gir e = new gir("NO_RENDER", null);

   public String a() {
      return this.f;
   }

   @Nullable
   public glq b() {
      return this.g;
   }
}
