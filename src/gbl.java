import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class gbl {
   public final Int2ObjectMap<gpg> a = new Int2ObjectOpenHashMap(256);
   private final Int2ObjectMap<goz> b = new Int2ObjectOpenHashMap(256);
   private final gpf c;

   public gbl(gpf $$0) {
      this.c = $$0;
   }

   public goz a(csz $$0) {
      goz $$1 = this.a($$0.f());
      return $$1 == null ? this.c.a() : $$1;
   }

   @Nullable
   public goz a(csu $$0) {
      return (goz)this.b.get(b($$0));
   }

   private static int b(csu $$0) {
      return csu.a($$0);
   }

   public void a(csu $$0, gpg $$1) {
      this.a.put(b($$0), $$1);
   }

   public gpf a() {
      return this.c;
   }

   public void b() {
      this.b.clear();
      ObjectIterator var1 = this.a.entrySet().iterator();

      while (var1.hasNext()) {
         Entry<Integer, gpg> $$0 = (Entry<Integer, gpg>)var1.next();
         this.b.put($$0.getKey(), this.c.a($$0.getValue()));
      }
   }
}
