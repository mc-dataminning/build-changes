import java.util.List;

public record xh(List<ht> b) implements wu {
   public static final afw a = new afw("debug/raids");

   public xh(tl $$0) {
      this($$0.a(tl::e));
   }

   @Override
   public void a(tl $$0) {
      $$0.a(this.b, tl::a);
   }

   @Override
   public afw a() {
      return a;
   }
}
