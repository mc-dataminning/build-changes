import javax.annotation.Nullable;

public record gkk(String f, @Nullable gnh g) {
   public static final gkk a = new gkk("TERRAIN_SHEET", gnh.B(hfq.d));
   public static final gkk b = new gkk("PARTICLE_SHEET_OPAQUE", gnh.A(hfq.e));
   public static final gkk c = new gkk("PARTICLE_SHEET_TRANSLUCENT", gnh.B(hfq.e));
   public static final gkk d = new gkk("CUSTOM", null);
   public static final gkk e = new gkk("NO_RENDER", null);

   public String a() {
      return this.f;
   }

   @Nullable
   public gnh b() {
      return this.g;
   }
}
