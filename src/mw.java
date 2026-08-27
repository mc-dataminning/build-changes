import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.function.Supplier;

public class mw implements mu {
   private final dby a;
   private final List<mw.b> b = Lists.newArrayList();

   private mw(dby $$0) {
      this.a = $$0;
   }

   @Override
   public dby a() {
      return this.a;
   }

   public static mw a(dby $$0) {
      return new mw($$0);
   }

   public mw a(List<na> $$0) {
      this.b.add(new mw.b($$0));
      return this;
   }

   public mw a(na $$0) {
      return this.a(ImmutableList.of($$0));
   }

   public mw a(mv $$0, List<na> $$1) {
      this.b.add(new mw.a($$0, $$1));
      return this;
   }

   public mw a(mv $$0, na... $$1) {
      return this.a($$0, ImmutableList.copyOf($$1));
   }

   public mw a(mv $$0, na $$1) {
      return this.a($$0, ImmutableList.of($$1));
   }

   public JsonElement b() {
      dpa<dby, doz> $$0 = this.a.l();
      this.b.forEach($$1x -> $$1x.a($$0));
      JsonArray $$1 = new JsonArray();
      this.b.stream().map(mw.b::a).forEach($$1::add);
      JsonObject $$2 = new JsonObject();
      $$2.add("multipart", $$1);
      return $$2;
   }

   static class a extends mw.b {
      private final mv a;

      a(mv $$0, List<na> $$1) {
         super($$1);
         this.a = $$0;
      }

      @Override
      public void a(dpa<?, ?> $$0) {
         this.a.a($$0);
      }

      @Override
      public void a(JsonObject $$0) {
         $$0.add("when", this.a.get());
      }
   }

   static class b implements Supplier<JsonElement> {
      private final List<na> a;

      b(List<na> $$0) {
         this.a = $$0;
      }

      public void a(dpa<?, ?> $$0) {
      }

      public void a(JsonObject $$0) {
      }

      public JsonElement a() {
         JsonObject $$0 = new JsonObject();
         this.a($$0);
         $$0.add("apply", na.a(this.a));
         return $$0;
      }
   }
}
