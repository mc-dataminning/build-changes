import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class gdj {
   public final Int2ObjectMap<grf> a = new Int2ObjectOpenHashMap(256);
   private final Int2ObjectMap<gqy> b = new Int2ObjectOpenHashMap(256);
   private final gre c;

   public gdj(gre $$0) {
      this.c = $$0;
   }

   public gqy a(cun $$0) {
      gqy $$1 = this.a($$0.g());
      return $$1 == null ? this.c.a() : $$1;
   }

   @Nullable
   public gqy a(cui $$0) {
      return (gqy)this.b.get(b($$0));
   }

   private static int b(cui $$0) {
      return cui.a($$0);
   }

   public void a(cui $$0, grf $$1) {
      this.a.put(b($$0), $$1);
   }

   public gre a() {
      return this.c;
   }

   public void b() {
      this.b.clear();
      ObjectIterator var1 = this.a.entrySet().iterator();

      while (var1.hasNext()) {
         Entry<Integer, grf> $$0 = (Entry<Integer, grf>)var1.next();
         this.b.put($$0.getKey(), this.c.a($$0.getValue()));
      }
   }
}
