import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.function.Supplier;

public class my implements mw {
   private final dch a;
   private final List<my.b> b = Lists.newArrayList();

   private my(dch $$0) {
      this.a = $$0;
   }

   @Override
   public dch a() {
      return this.a;
   }

   public static my a(dch $$0) {
      return new my($$0);
   }

   public my a(List<nc> $$0) {
      this.b.add(new my.b($$0));
      return this;
   }

   public my a(nc $$0) {
      return this.a(ImmutableList.of($$0));
   }

   public my a(mx $$0, List<nc> $$1) {
      this.b.add(new my.a($$0, $$1));
      return this;
   }

   public my a(mx $$0, nc... $$1) {
      return this.a($$0, ImmutableList.copyOf($$1));
   }

   public my a(mx $$0, nc $$1) {
      return this.a($$0, ImmutableList.of($$1));
   }

   public JsonElement b() {
      dpj<dch, dpi> $$0 = this.a.l();
      this.b.forEach($$1x -> $$1x.a($$0));
      JsonArray $$1 = new JsonArray();
      this.b.stream().map(my.b::a).forEach($$1::add);
      JsonObject $$2 = new JsonObject();
      $$2.add("multipart", $$1);
      return $$2;
   }

   static class a extends my.b {
      private final mx a;

      a(mx $$0, List<nc> $$1) {
         super($$1);
         this.a = $$0;
      }

      @Override
      public void a(dpj<?, ?> $$0) {
         this.a.a($$0);
      }

      @Override
      public void a(JsonObject $$0) {
         $$0.add("when", this.a.get());
      }
   }

   static class b implements Supplier<JsonElement> {
      private final List<nc> a;

      b(List<nc> $$0) {
         this.a = $$0;
      }

      public void a(dpj<?, ?> $$0) {
      }

      public void a(JsonObject $$0) {
      }

      public JsonElement a() {
         JsonObject $$0 = new JsonObject();
         this.a($$0);
         $$0.add("apply", nc.a(this.a));
         return $$0;
      }
   }
}
