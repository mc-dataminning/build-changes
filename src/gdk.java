import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class gdk {
   public final Int2ObjectMap<grg> a = new Int2ObjectOpenHashMap(256);
   private final Int2ObjectMap<gqz> b = new Int2ObjectOpenHashMap(256);
   private final grf c;

   public gdk(grf $$0) {
      this.c = $$0;
   }

   public gqz a(cuo $$0) {
      gqz $$1 = this.a($$0.g());
      return $$1 == null ? this.c.a() : $$1;
   }

   @Nullable
   public gqz a(cuj $$0) {
      return (gqz)this.b.get(b($$0));
   }

   private static int b(cuj $$0) {
      return cuj.a($$0);
   }

   public void a(cuj $$0, grg $$1) {
      this.a.put(b($$0), $$1);
   }

   public grf a() {
      return this.c;
   }

   public void b() {
      this.b.clear();
      ObjectIterator var1 = this.a.entrySet().iterator();

      while (var1.hasNext()) {
         Entry<Integer, grg> $$0 = (Entry<Integer, grg>)var1.next();
         this.b.put($$0.getKey(), this.c.a($$0.getValue()));
      }
   }
}
