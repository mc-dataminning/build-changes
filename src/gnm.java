import javax.annotation.Nullable;

public record gnm(String f, @Nullable gqk g) {
   public static final gnm a = new gnm("TERRAIN_SHEET", gqk.B(hiw.d));
   public static final gnm b = new gnm("PARTICLE_SHEET_OPAQUE", gqk.A(hiw.e));
   public static final gnm c = new gnm("PARTICLE_SHEET_TRANSLUCENT", gqk.B(hiw.e));
   public static final gnm d = new gnm("CUSTOM", null);
   public static final gnm e = new gnm("NO_RENDER", null);

   public String a() {
      return this.f;
   }

   @Nullable
   public gqk b() {
      return this.g;
   }
}
