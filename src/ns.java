import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.function.Supplier;

public class ns implements nq {
   private final dfw a;
   private final List<ns.b> b = Lists.newArrayList();

   private ns(dfw $$0) {
      this.a = $$0;
   }

   @Override
   public dfw a() {
      return this.a;
   }

   public static ns a(dfw $$0) {
      return new ns($$0);
   }

   public ns a(List<nw> $$0) {
      this.b.add(new ns.b($$0));
      return this;
   }

   public ns a(nw $$0) {
      return this.a(ImmutableList.of($$0));
   }

   public ns a(nr $$0, List<nw> $$1) {
      this.b.add(new ns.a($$0, $$1));
      return this;
   }

   public ns a(nr $$0, nw... $$1) {
      return this.a($$0, ImmutableList.copyOf($$1));
   }

   public ns a(nr $$0, nw $$1) {
      return this.a($$0, ImmutableList.of($$1));
   }

   public JsonElement b() {
      dtb<dfw, dta> $$0 = this.a.l();
      this.b.forEach($$1x -> $$1x.a($$0));
      JsonArray $$1 = new JsonArray();
      this.b.stream().map(ns.b::a).forEach($$1::add);
      JsonObject $$2 = new JsonObject();
      $$2.add("multipart", $$1);
      return $$2;
   }

   static class a extends ns.b {
      private final nr a;

      a(nr $$0, List<nw> $$1) {
         super($$1);
         this.a = $$0;
      }

      @Override
      public void a(dtb<?, ?> $$0) {
         this.a.a($$0);
      }

      @Override
      public void a(JsonObject $$0) {
         $$0.add("when", this.a.get());
      }
   }

   static class b implements Supplier<JsonElement> {
      private final List<nw> a;

      b(List<nw> $$0) {
         this.a = $$0;
      }

      public void a(dtb<?, ?> $$0) {
      }

      public void a(JsonObject $$0) {
      }

      public JsonElement a() {
         JsonObject $$0 = new JsonObject();
         this.a($$0);
         $$0.add("apply", nw.a(this.a));
         return $$0;
      }
   }
}
