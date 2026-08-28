import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.function.Supplier;

public class nw implements nu {
   private final dez a;
   private final List<nw.b> b = Lists.newArrayList();

   private nw(dez $$0) {
      this.a = $$0;
   }

   @Override
   public dez a() {
      return this.a;
   }

   public static nw a(dez $$0) {
      return new nw($$0);
   }

   public nw a(List<oa> $$0) {
      this.b.add(new nw.b($$0));
      return this;
   }

   public nw a(oa $$0) {
      return this.a(ImmutableList.of($$0));
   }

   public nw a(nv $$0, List<oa> $$1) {
      this.b.add(new nw.a($$0, $$1));
      return this;
   }

   public nw a(nv $$0, oa... $$1) {
      return this.a($$0, ImmutableList.copyOf($$1));
   }

   public nw a(nv $$0, oa $$1) {
      return this.a($$0, ImmutableList.of($$1));
   }

   public JsonElement b() {
      dsd<dez, dsc> $$0 = this.a.l();
      this.b.forEach($$1x -> $$1x.a($$0));
      JsonArray $$1 = new JsonArray();
      this.b.stream().map(nw.b::a).forEach($$1::add);
      JsonObject $$2 = new JsonObject();
      $$2.add("multipart", $$1);
      return $$2;
   }

   static class a extends nw.b {
      private final nv a;

      a(nv $$0, List<oa> $$1) {
         super($$1);
         this.a = $$0;
      }

      @Override
      public void a(dsd<?, ?> $$0) {
         this.a.a($$0);
      }

      @Override
      public void a(JsonObject $$0) {
         $$0.add("when", this.a.get());
      }
   }

   static class b implements Supplier<JsonElement> {
      private final List<oa> a;

      b(List<oa> $$0) {
         this.a = $$0;
      }

      public void a(dsd<?, ?> $$0) {
      }

      public void a(JsonObject $$0) {
      }

      public JsonElement a() {
         JsonObject $$0 = new JsonObject();
         this.a($$0);
         $$0.add("apply", oa.a(this.a));
         return $$0;
      }
   }
}
