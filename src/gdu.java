import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class gdu {
   public final Int2ObjectMap<grq> a = new Int2ObjectOpenHashMap(256);
   private final Int2ObjectMap<grj> b = new Int2ObjectOpenHashMap(256);
   private final grp c;

   public gdu(grp $$0) {
      this.c = $$0;
   }

   public grj a(cua $$0) {
      grj $$1 = this.a($$0.g());
      return $$1 == null ? this.c.a() : $$1;
   }

   @Nullable
   public grj a(ctv $$0) {
      return (grj)this.b.get(b($$0));
   }

   private static int b(ctv $$0) {
      return ctv.a($$0);
   }

   public void a(ctv $$0, grq $$1) {
      this.a.put(b($$0), $$1);
   }

   public grp a() {
      return this.c;
   }

   public void b() {
      this.b.clear();
      ObjectIterator var1 = this.a.entrySet().iterator();

      while (var1.hasNext()) {
         Entry<Integer, grq> $$0 = (Entry<Integer, grq>)var1.next();
         this.b.put($$0.getKey(), this.c.a($$0.getValue()));
      }
   }
}
