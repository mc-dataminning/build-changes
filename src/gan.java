import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public abstract class gan extends euq {
   protected static final int k = 17;
   protected static final int l = 20;
   protected static final int m = 7;
   protected static final long n = 5368709120L;
   public static final int o = 16777215;
   public static final int p = 10526880;
   protected static final int q = 5000268;
   protected static final int r = 7105644;
   protected static final int s = 8388479;
   protected static final int t = 6077788;
   protected static final int u = 16711680;
   protected static final int v = 15553363;
   protected static final int w = -1073741824;
   protected static final int x = 13413468;
   protected static final int y = -256;
   protected static final int z = 3368635;
   protected static final int A = 7107012;
   protected static final int C = 8226750;
   protected static final int D = 16777120;
   protected static final String E = "https://www.minecraft.net/realms/adventure-maps-in-1-9";
   protected static final int F = 8;
   private final List<gal> a = Lists.newArrayList();

   public gan(sw $$0) {
      super($$0);
   }

   protected static int h(int $$0) {
      return 40 + $$0 * 13;
   }

   protected gal a(gal $$0) {
      this.a.add($$0);
      return this.a($$0);
   }

   public sw l() {
      return sv.a(this.a.stream().map(gal::a).collect(Collectors.toList()));
   }
}
