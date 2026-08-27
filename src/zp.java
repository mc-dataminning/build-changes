import java.util.List;

public record zp(List<ib> c) implements zc {
   public static final xs<uu, zp> a = zc.a(zp::a, zp::new);
   public static final zc.b<zp> b = zc.a("debug/raids");

   private zp(uu $$0) {
      this($$0.a(ib.b));
   }

   private void a(uu $$0) {
      $$0.a(this.c, ib.b);
   }

   @Override
   public zc.b<zp> a() {
      return b;
   }

   public List<ib> b() {
      return this.c;
   }
}
