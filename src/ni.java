import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.function.Supplier;

public class ni implements ng {
   private final dde a;
   private final List<ni.b> b = Lists.newArrayList();

   private ni(dde $$0) {
      this.a = $$0;
   }

   @Override
   public dde a() {
      return this.a;
   }

   public static ni a(dde $$0) {
      return new ni($$0);
   }

   public ni a(List<nm> $$0) {
      this.b.add(new ni.b($$0));
      return this;
   }

   public ni a(nm $$0) {
      return this.a(ImmutableList.of($$0));
   }

   public ni a(nh $$0, List<nm> $$1) {
      this.b.add(new ni.a($$0, $$1));
      return this;
   }

   public ni a(nh $$0, nm... $$1) {
      return this.a($$0, ImmutableList.copyOf($$1));
   }

   public ni a(nh $$0, nm $$1) {
      return this.a($$0, ImmutableList.of($$1));
   }

   public JsonElement b() {
      dqi<dde, dqh> $$0 = this.a.l();
      this.b.forEach($$1x -> $$1x.a($$0));
      JsonArray $$1 = new JsonArray();
      this.b.stream().map(ni.b::a).forEach($$1::add);
      JsonObject $$2 = new JsonObject();
      $$2.add("multipart", $$1);
      return $$2;
   }

   static class a extends ni.b {
      private final nh a;

      a(nh $$0, List<nm> $$1) {
         super($$1);
         this.a = $$0;
      }

      @Override
      public void a(dqi<?, ?> $$0) {
         this.a.a($$0);
      }

      @Override
      public void a(JsonObject $$0) {
         $$0.add("when", this.a.get());
      }
   }

   static class b implements Supplier<JsonElement> {
      private final List<nm> a;

      b(List<nm> $$0) {
         this.a = $$0;
      }

      public void a(dqi<?, ?> $$0) {
      }

      public void a(JsonObject $$0) {
      }

      public JsonElement a() {
         JsonObject $$0 = new JsonObject();
         this.a($$0);
         $$0.add("apply", nm.a(this.a));
         return $$0;
      }
   }
}
