import java.util.List;

public record zw(int c, id d, List<zw.a> e) implements zq {
   public static final yg<vi, zw> a = zq.a(zw::a, zw::new);
   public static final zq.b<zw> b = zq.a("debug/goal_selector");

   private zw(vi $$0) {
      this($$0.readInt(), $$0.e(), $$0.a(zw.a::new));
   }

   private void a(vi $$0) {
      $$0.p(this.c);
      $$0.a(this.d);
      $$0.a(this.e, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zq.b<zw> a() {
      return b;
   }

   public int b() {
      return this.c;
   }

   public id c() {
      return this.d;
   }

   public List<zw.a> d() {
      return this.e;
   }

   public static record a(int a, boolean b, String c) {
      public a(vi $$0) {
         this($$0.readInt(), $$0.readBoolean(), $$0.d(255));
      }

      public void a(vi $$0) {
         $$0.p(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
      }
   }
}
