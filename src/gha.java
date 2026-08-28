import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class gha {
   public final Int2ObjectMap<gzo> a = new Int2ObjectOpenHashMap(256);
   private final Int2ObjectMap<gzd> b = new Int2ObjectOpenHashMap(256);
   private final gzn c;

   public gha(gzn $$0) {
      this.c = $$0;
   }

   public gzd a(cvp $$0) {
      gzd $$1 = this.a($$0.h());
      return $$1 == null ? this.c.a() : $$1;
   }

   @Nullable
   public gzd a(cvk $$0) {
      return (gzd)this.b.get(b($$0));
   }

   private static int b(cvk $$0) {
      return cvk.a($$0);
   }

   public void a(cvk $$0, gzo $$1) {
      this.a.put(b($$0), $$1);
   }

   public gzn a() {
      return this.c;
   }

   public void b() {
      this.b.clear();
      ObjectIterator var1 = this.a.entrySet().iterator();

      while (var1.hasNext()) {
         Entry<Integer, gzo> $$0 = (Entry<Integer, gzo>)var1.next();
         this.b.put($$0.getKey(), this.c.a($$0.getValue()));
      }
   }
}
