import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class gaf {
   public final Int2ObjectMap<gnz> a = new Int2ObjectOpenHashMap(256);
   private final Int2ObjectMap<gns> b = new Int2ObjectOpenHashMap(256);
   private final gny c;

   public gaf(gny $$0) {
      this.c = $$0;
   }

   public gns a(crs $$0) {
      gns $$1 = this.a($$0.f());
      return $$1 == null ? this.c.a() : $$1;
   }

   @Nullable
   public gns a(crn $$0) {
      return (gns)this.b.get(b($$0));
   }

   private static int b(crn $$0) {
      return crn.a($$0);
   }

   public void a(crn $$0, gnz $$1) {
      this.a.put(b($$0), $$1);
   }

   public gny a() {
      return this.c;
   }

   public void b() {
      this.b.clear();
      ObjectIterator var1 = this.a.entrySet().iterator();

      while (var1.hasNext()) {
         Entry<Integer, gnz> $$0 = (Entry<Integer, gnz>)var1.next();
         this.b.put($$0.getKey(), this.c.a($$0.getValue()));
      }
   }
}
