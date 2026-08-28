import javax.annotation.Nullable;

public record gjk(String f, @Nullable gmh g) {
   public static final gjk a = new gjk("TERRAIN_SHEET", gmh.B(hei.d));
   public static final gjk b = new gjk("PARTICLE_SHEET_OPAQUE", gmh.A(hei.e));
   public static final gjk c = new gjk("PARTICLE_SHEET_TRANSLUCENT", gmh.B(hei.e));
   public static final gjk d = new gjk("CUSTOM", null);
   public static final gjk e = new gjk("NO_RENDER", null);

   public String a() {
      return this.f;
   }

   @Nullable
   public gmh b() {
      return this.g;
   }
}
