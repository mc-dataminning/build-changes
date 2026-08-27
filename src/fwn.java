import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class fwn {
   public final Int2ObjectMap<gkg> a = new Int2ObjectOpenHashMap(256);
   private final Int2ObjectMap<gjz> b = new Int2ObjectOpenHashMap(256);
   private final gkf c;

   public fwn(gkf $$0) {
      this.c = $$0;
   }

   public gjz a(cpq $$0) {
      gjz $$1 = this.a($$0.d());
      return $$1 == null ? this.c.a() : $$1;
   }

   @Nullable
   public gjz a(cpl $$0) {
      return (gjz)this.b.get(b($$0));
   }

   private static int b(cpl $$0) {
      return cpl.a($$0);
   }

   public void a(cpl $$0, gkg $$1) {
      this.a.put(b($$0), $$1);
   }

   public gkf a() {
      return this.c;
   }

   public void b() {
      this.b.clear();
      ObjectIterator var1 = this.a.entrySet().iterator();

      while (var1.hasNext()) {
         Entry<Integer, gkg> $$0 = (Entry<Integer, gkg>)var1.next();
         this.b.put($$0.getKey(), this.c.a($$0.getValue()));
      }
   }
}
