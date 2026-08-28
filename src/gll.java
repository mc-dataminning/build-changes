import javax.annotation.Nullable;

public record gll(String f, @Nullable goi g) {
   public static final gll a = new gll("TERRAIN_SHEET", goi.B(hgr.d));
   public static final gll b = new gll("PARTICLE_SHEET_OPAQUE", goi.A(hgr.e));
   public static final gll c = new gll("PARTICLE_SHEET_TRANSLUCENT", goi.B(hgr.e));
   public static final gll d = new gll("CUSTOM", null);
   public static final gll e = new gll("NO_RENDER", null);

   public String a() {
      return this.f;
   }

   @Nullable
   public goi b() {
      return this.g;
   }
}
