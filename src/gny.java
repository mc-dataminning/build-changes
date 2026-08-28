import javax.annotation.Nullable;

public record gny(String f, @Nullable gqx g) {
   public static final gny a = new gny("TERRAIN_SHEET", gqx.B(hjj.c));
   public static final gny b = new gny("PARTICLE_SHEET_OPAQUE", gqx.A(hjj.d));
   public static final gny c = new gny("PARTICLE_SHEET_TRANSLUCENT", gqx.B(hjj.d));
   public static final gny d = new gny("CUSTOM", null);
   public static final gny e = new gny("NO_RENDER", null);

   public String a() {
      return this.f;
   }

   @Nullable
   public gqx b() {
      return this.g;
   }
}
