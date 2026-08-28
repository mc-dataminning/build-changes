import javax.annotation.Nullable;

public record gne(String f, @Nullable gqc g) {
   public static final gne a = new gne("TERRAIN_SHEET", gqc.B(hio.d));
   public static final gne b = new gne("PARTICLE_SHEET_OPAQUE", gqc.A(hio.e));
   public static final gne c = new gne("PARTICLE_SHEET_TRANSLUCENT", gqc.B(hio.e));
   public static final gne d = new gne("CUSTOM", null);
   public static final gne e = new gne("NO_RENDER", null);

   public String a() {
      return this.f;
   }

   @Nullable
   public gqc b() {
      return this.g;
   }
}
