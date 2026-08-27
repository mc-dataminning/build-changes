import java.util.List;

public record xq(List<ht> b) implements xd {
   public static final agg a = new agg("debug/raids");

   public xq(tu $$0) {
      this($$0.a(tu::e));
   }

   @Override
   public void a(tu $$0) {
      $$0.a(this.b, tu::a);
   }

   @Override
   public agg a() {
      return a;
   }
}
