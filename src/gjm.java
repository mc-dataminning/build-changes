import javax.annotation.Nullable;

public record gjm(String f, @Nullable gmj g) {
   public static final gjm a = new gjm("TERRAIN_SHEET", gmj.B(hes.d));
   public static final gjm b = new gjm("PARTICLE_SHEET_OPAQUE", gmj.A(hes.e));
   public static final gjm c = new gjm("PARTICLE_SHEET_TRANSLUCENT", gmj.B(hes.e));
   public static final gjm d = new gjm("CUSTOM", null);
   public static final gjm e = new gjm("NO_RENDER", null);

   public String a() {
      return this.f;
   }

   @Nullable
   public gmj b() {
      return this.g;
   }
}
