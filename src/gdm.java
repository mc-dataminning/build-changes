import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class gdm {
   public final Int2ObjectMap<gri> a = new Int2ObjectOpenHashMap(256);
   private final Int2ObjectMap<grb> b = new Int2ObjectOpenHashMap(256);
   private final grh c;

   public gdm(grh $$0) {
      this.c = $$0;
   }

   public grb a(cuq $$0) {
      grb $$1 = this.a($$0.g());
      return $$1 == null ? this.c.a() : $$1;
   }

   @Nullable
   public grb a(cul $$0) {
      return (grb)this.b.get(b($$0));
   }

   private static int b(cul $$0) {
      return cul.a($$0);
   }

   public void a(cul $$0, gri $$1) {
      this.a.put(b($$0), $$1);
   }

   public grh a() {
      return this.c;
   }

   public void b() {
      this.b.clear();
      ObjectIterator var1 = this.a.entrySet().iterator();

      while (var1.hasNext()) {
         Entry<Integer, gri> $$0 = (Entry<Integer, gri>)var1.next();
         this.b.put($$0.getKey(), this.c.a($$0.getValue()));
      }
   }
}
