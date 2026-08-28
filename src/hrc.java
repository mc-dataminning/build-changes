import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public abstract class hrc extends fzq {
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
   private final List<hrb> a = Lists.newArrayList();

   public hrc(xg $$0) {
      super($$0);
   }

   protected static int g(int $$0) {
      return 40 + $$0 * 13;
   }

   protected hrb a(hrb $$0) {
      this.a.add($$0);
      return this.a($$0);
   }

   public xg m() {
      return xf.a(this.a.stream().map(hrb::a).collect(Collectors.toList()));
   }
}
