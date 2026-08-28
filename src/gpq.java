import javax.annotation.Nullable;

public record gpq(String f, @Nullable gsn g) {
   public static final gpq a = new gpq("TERRAIN_SHEET", gsn.B(hlb.c));
   public static final gpq b = new gpq("PARTICLE_SHEET_OPAQUE", gsn.A(hlb.d));
   public static final gpq c = new gpq("PARTICLE_SHEET_TRANSLUCENT", gsn.B(hlb.d));
   public static final gpq d = new gpq("CUSTOM", null);
   public static final gpq e = new gpq("NO_RENDER", null);

   public String a() {
      return this.f;
   }

   @Nullable
   public gsn b() {
      return this.g;
   }
}
