import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public abstract class gld extends fdm {
   protected static final int k = 17;
   protected static final int l = 7;
   protected static final long m = 5368709120L;
   protected static final int n = 5000268;
   protected static final int o = 7105644;
   protected static final int p = 8388479;
   protected static final int q = 3368635;
   protected static final int r = 7107012;
   protected static final int t = 8226750;
   protected static final int u = 8;
   private final List<glb> a = Lists.newArrayList();

   public gld(vg $$0) {
      super($$0);
   }

   protected static int g(int $$0) {
      return 40 + $$0 * 13;
   }

   protected glb a(glb $$0) {
      this.a.add($$0);
      return this.a($$0);
   }

   public vg o() {
      return vf.a(this.a.stream().map(glb::a).collect(Collectors.toList()));
   }
}
