import java.util.List;

public record zl(List<hz> c) implements yy {
   public static final xo<uq, zl> a = yy.a(zl::a, zl::new);
   public static final yy.b<zl> b = yy.a("debug/raids");

   private zl(uq $$0) {
      this($$0.a(hz.b));
   }

   private void a(uq $$0) {
      $$0.a(this.c, hz.b);
   }

   @Override
   public yy.b<zl> a() {
      return b;
   }

   public List<hz> b() {
      return this.c;
   }
}
