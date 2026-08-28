import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public abstract class hol extends fxi {
   protected static final int d = 17;
   protected static final int s = 7;
   protected static final long u = 5368709120L;
   protected static final int v = 5000268;
   protected static final int w = 7105644;
   protected static final int x = 8388479;
   protected static final int y = 3368635;
   protected static final int z = 7107012;
   protected static final int A = 32;
   protected static final int B = 8;
   private final List<hok> a = Lists.newArrayList();

   public hol(ww $$0) {
      super($$0);
   }

   protected static int g(int $$0) {
      return 40 + $$0 * 13;
   }

   protected hok a(hok $$0) {
      this.a.add($$0);
      return this.a($$0);
   }

   public ww m() {
      return wv.a(this.a.stream().map(hok::a).collect(Collectors.toList()));
   }
}
