import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class geq {
   public final Int2ObjectMap<gsn> a = new Int2ObjectOpenHashMap(256);
   private final Int2ObjectMap<gsg> b = new Int2ObjectOpenHashMap(256);
   private final gsm c;

   public geq(gsm $$0) {
      this.c = $$0;
   }

   public gsg a(cuo $$0) {
      gsg $$1 = this.a($$0.g());
      return $$1 == null ? this.c.a() : $$1;
   }

   @Nullable
   public gsg a(cuj $$0) {
      return (gsg)this.b.get(b($$0));
   }

   private static int b(cuj $$0) {
      return cuj.a($$0);
   }

   public void a(cuj $$0, gsn $$1) {
      this.a.put(b($$0), $$1);
   }

   public gsm a() {
      return this.c;
   }

   public void b() {
      this.b.clear();
      ObjectIterator var1 = this.a.entrySet().iterator();

      while (var1.hasNext()) {
         Entry<Integer, gsn> $$0 = (Entry<Integer, gsn>)var1.next();
         this.b.put($$0.getKey(), this.c.a($$0.getValue()));
      }
   }
}
