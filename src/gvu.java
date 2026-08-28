import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public abstract class gvu extends fnl {
   protected static final int q = 17;
   protected static final int r = 7;
   protected static final long s = 5368709120L;
   protected static final int u = 5000268;
   protected static final int v = 7105644;
   protected static final int w = 8388479;
   protected static final int x = 3368635;
   protected static final int y = 7107012;
   protected static final int z = 32;
   private final List<gvs> a = Lists.newArrayList();

   public gvu(wu $$0) {
      super($$0);
   }

   protected static int g(int $$0) {
      return 40 + $$0 * 13;
   }

   protected gvs a(gvs $$0) {
      this.a.add($$0);
      return this.a($$0);
   }

   public wu m() {
      return wt.a(this.a.stream().map(gvs::a).collect(Collectors.toList()));
   }
}
