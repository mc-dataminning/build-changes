import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class gdn {
   public final Int2ObjectMap<grj> a = new Int2ObjectOpenHashMap(256);
   private final Int2ObjectMap<grc> b = new Int2ObjectOpenHashMap(256);
   private final gri c;

   public gdn(gri $$0) {
      this.c = $$0;
   }

   public grc a(cur $$0) {
      grc $$1 = this.a($$0.g());
      return $$1 == null ? this.c.a() : $$1;
   }

   @Nullable
   public grc a(cum $$0) {
      return (grc)this.b.get(b($$0));
   }

   private static int b(cum $$0) {
      return cum.a($$0);
   }

   public void a(cum $$0, grj $$1) {
      this.a.put(b($$0), $$1);
   }

   public gri a() {
      return this.c;
   }

   public void b() {
      this.b.clear();
      ObjectIterator var1 = this.a.entrySet().iterator();

      while (var1.hasNext()) {
         Entry<Integer, grj> $$0 = (Entry<Integer, grj>)var1.next();
         this.b.put($$0.getKey(), this.c.a($$0.getValue()));
      }
   }
}
