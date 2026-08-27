import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class fvj {
   public final Int2ObjectMap<gjb> a = new Int2ObjectOpenHashMap(256);
   private final Int2ObjectMap<giu> b = new Int2ObjectOpenHashMap(256);
   private final gja c;

   public fvj(gja $$0) {
      this.c = $$0;
   }

   public giu a(coz $$0) {
      giu $$1 = this.a($$0.d());
      return $$1 == null ? this.c.a() : $$1;
   }

   @Nullable
   public giu a(cou $$0) {
      return (giu)this.b.get(b($$0));
   }

   private static int b(cou $$0) {
      return cou.a($$0);
   }

   public void a(cou $$0, gjb $$1) {
      this.a.put(b($$0), $$1);
   }

   public gja a() {
      return this.c;
   }

   public void b() {
      this.b.clear();
      ObjectIterator var1 = this.a.entrySet().iterator();

      while (var1.hasNext()) {
         Entry<Integer, gjb> $$0 = (Entry<Integer, gjb>)var1.next();
         this.b.put($$0.getKey(), this.c.a($$0.getValue()));
      }
   }
}
