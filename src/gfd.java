import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public abstract class gfd extends eym {
   protected static final int k = 17;
   protected static final int l = 7;
   protected static final long m = 5368709120L;
   protected static final int n = 5000268;
   protected static final int o = 7105644;
   protected static final int p = 8388479;
   protected static final int q = 15553363;
   protected static final int s = 13413468;
   protected static final int t = -256;
   protected static final int u = 3368635;
   protected static final int v = 7107012;
   protected static final int w = 8226750;
   protected static final int x = 8;
   private final List<gfb> a = Lists.newArrayList();

   public gfd(tn $$0) {
      super($$0);
   }

   protected static int h(int $$0) {
      return 40 + $$0 * 13;
   }

   protected gfb a(gfb $$0) {
      this.a.add($$0);
      return this.a($$0);
   }

   public tn l() {
      return tm.a(this.a.stream().map(gfb::a).collect(Collectors.toList()));
   }
}
