import com.google.common.collect.Lists;
import java.util.List;

public class gbx implements gbz {
   private static final wv a = wv.c("spectatorMenu.root.prompt");
   private final List<gca> b = Lists.newArrayList();

   public gbx() {
      this.b.add(new gcd());
      this.b.add(new gce());
   }

   @Override
   public List<gca> a() {
      return this.b;
   }

   @Override
   public wv b() {
      return a;
   }
}
