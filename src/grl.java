import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public abstract class grl extends fjo {
   protected static final int d = 17;
   protected static final int o = 7;
   protected static final long p = 5368709120L;
   protected static final int q = 5000268;
   protected static final int r = 7105644;
   protected static final int s = 8388479;
   protected static final int u = 3368635;
   protected static final int v = 7107012;
   protected static final int w = 8226750;
   protected static final int x = 32;
   private final List<grj> a = Lists.newArrayList();

   public grl(wg $$0) {
      super($$0);
   }

   protected static int g(int $$0) {
      return 40 + $$0 * 13;
   }

   protected grj a(grj $$0) {
      this.a.add($$0);
      return this.a($$0);
   }

   public wg m() {
      return wf.a(this.a.stream().map(grj::a).collect(Collectors.toList()));
   }
}
