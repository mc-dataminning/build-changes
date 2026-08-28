import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public abstract class gve extends fnb {
   protected static final int d = 17;
   protected static final int r = 7;
   protected static final long s = 5368709120L;
   protected static final int u = 5000268;
   protected static final int v = 7105644;
   protected static final int w = 8388479;
   protected static final int x = 3368635;
   protected static final int y = 7107012;
   protected static final int z = 8226750;
   protected static final int A = 32;
   private final List<gvc> a = Lists.newArrayList();

   public gve(xo $$0) {
      super($$0);
   }

   protected static int g(int $$0) {
      return 40 + $$0 * 13;
   }

   protected gvc a(gvc $$0) {
      this.a.add($$0);
      return this.a($$0);
   }

   public xo m() {
      return xn.a(this.a.stream().map(gvc::a).collect(Collectors.toList()));
   }
}
