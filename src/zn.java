import java.util.List;

public record zn(List<ib> c) implements za {
   public static final xq<us, zn> a = za.a(zn::a, zn::new);
   public static final za.b<zn> b = za.a("debug/raids");

   private zn(us $$0) {
      this($$0.a(ib.b));
   }

   private void a(us $$0) {
      $$0.a(this.c, ib.b);
   }

   @Override
   public za.b<zn> a() {
      return b;
   }

   public List<ib> b() {
      return this.c;
   }
}
