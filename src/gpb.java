import javax.annotation.Nullable;

public record gpb(String f, @Nullable gry g) {
   public static final gpb a = new gpb("TERRAIN_SHEET", gry.B(hkp.c));
   public static final gpb b = new gpb("PARTICLE_SHEET_OPAQUE", gry.A(hkp.d));
   public static final gpb c = new gpb("PARTICLE_SHEET_TRANSLUCENT", gry.B(hkp.d));
   public static final gpb d = new gpb("CUSTOM", null);
   public static final gpb e = new gpb("NO_RENDER", null);

   public String a() {
      return this.f;
   }

   @Nullable
   public gry b() {
      return this.g;
   }
}
