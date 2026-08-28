import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class ggp {
   public final Int2ObjectMap<gyx> a = new Int2ObjectOpenHashMap(256);
   private final Int2ObjectMap<gym> b = new Int2ObjectOpenHashMap(256);
   private final gyw c;

   public ggp(gyw $$0) {
      this.c = $$0;
   }

   public gym a(cvl $$0) {
      gym $$1 = this.a($$0.h());
      return $$1 == null ? this.c.a() : $$1;
   }

   @Nullable
   public gym a(cvg $$0) {
      return (gym)this.b.get(b($$0));
   }

   private static int b(cvg $$0) {
      return cvg.a($$0);
   }

   public void a(cvg $$0, gyx $$1) {
      this.a.put(b($$0), $$1);
   }

   public gyw a() {
      return this.c;
   }

   public void b() {
      this.b.clear();
      ObjectIterator var1 = this.a.entrySet().iterator();

      while (var1.hasNext()) {
         Entry<Integer, gyx> $$0 = (Entry<Integer, gyx>)var1.next();
         this.b.put($$0.getKey(), this.c.a($$0.getValue()));
      }
   }
}
