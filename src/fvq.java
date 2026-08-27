import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class fvq {
   public final Int2ObjectMap<gji> a = new Int2ObjectOpenHashMap(256);
   private final Int2ObjectMap<gjb> b = new Int2ObjectOpenHashMap(256);
   private final gjh c;

   public fvq(gjh $$0) {
      this.c = $$0;
   }

   public gjb a(cpd $$0) {
      gjb $$1 = this.a($$0.d());
      return $$1 == null ? this.c.a() : $$1;
   }

   @Nullable
   public gjb a(coy $$0) {
      return (gjb)this.b.get(b($$0));
   }

   private static int b(coy $$0) {
      return coy.a($$0);
   }

   public void a(coy $$0, gji $$1) {
      this.a.put(b($$0), $$1);
   }

   public gjh a() {
      return this.c;
   }

   public void b() {
      this.b.clear();
      ObjectIterator var1 = this.a.entrySet().iterator();

      while (var1.hasNext()) {
         Entry<Integer, gji> $$0 = (Entry<Integer, gji>)var1.next();
         this.b.put($$0.getKey(), this.c.a($$0.getValue()));
      }
   }
}
