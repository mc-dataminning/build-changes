import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public abstract class gex extends eye {
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
   private final List<gev> a = Lists.newArrayList();

   public gex(tl $$0) {
      super($$0);
   }

   protected static int h(int $$0) {
      return 40 + $$0 * 13;
   }

   protected gev a(gev $$0) {
      this.a.add($$0);
      return this.a($$0);
   }

   public tl l() {
      return tk.a(this.a.stream().map(gev::a).collect(Collectors.toList()));
   }
}
