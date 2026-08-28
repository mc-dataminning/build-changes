import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class ghf {
   public final Int2ObjectMap<gzt> a = new Int2ObjectOpenHashMap(256);
   private final Int2ObjectMap<gzi> b = new Int2ObjectOpenHashMap(256);
   private final gzs c;

   public ghf(gzs $$0) {
      this.c = $$0;
   }

   public gzi a(cvs $$0) {
      gzi $$1 = this.a($$0.h());
      return $$1 == null ? this.c.a() : $$1;
   }

   @Nullable
   public gzi a(cvn $$0) {
      return (gzi)this.b.get(b($$0));
   }

   private static int b(cvn $$0) {
      return cvn.a($$0);
   }

   public void a(cvn $$0, gzt $$1) {
      this.a.put(b($$0), $$1);
   }

   public gzs a() {
      return this.c;
   }

   public void b() {
      this.b.clear();
      ObjectIterator var1 = this.a.entrySet().iterator();

      while (var1.hasNext()) {
         Entry<Integer, gzt> $$0 = (Entry<Integer, gzt>)var1.next();
         this.b.put($$0.getKey(), this.c.a($$0.getValue()));
      }
   }
}
