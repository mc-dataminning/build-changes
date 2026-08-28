import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class gea {
   public final Int2ObjectMap<grw> a = new Int2ObjectOpenHashMap(256);
   private final Int2ObjectMap<grp> b = new Int2ObjectOpenHashMap(256);
   private final grv c;

   public gea(grv $$0) {
      this.c = $$0;
   }

   public grp a(cuc $$0) {
      grp $$1 = this.a($$0.g());
      return $$1 == null ? this.c.a() : $$1;
   }

   @Nullable
   public grp a(ctx $$0) {
      return (grp)this.b.get(b($$0));
   }

   private static int b(ctx $$0) {
      return ctx.a($$0);
   }

   public void a(ctx $$0, grw $$1) {
      this.a.put(b($$0), $$1);
   }

   public grv a() {
      return this.c;
   }

   public void b() {
      this.b.clear();
      ObjectIterator var1 = this.a.entrySet().iterator();

      while (var1.hasNext()) {
         Entry<Integer, grw> $$0 = (Entry<Integer, grw>)var1.next();
         this.b.put($$0.getKey(), this.c.a($$0.getValue()));
      }
   }
}
