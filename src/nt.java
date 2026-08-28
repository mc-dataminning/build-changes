import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.function.Supplier;

public class nt implements nr {
   private final dfy a;
   private final List<nt.b> b = Lists.newArrayList();

   private nt(dfy $$0) {
      this.a = $$0;
   }

   @Override
   public dfy a() {
      return this.a;
   }

   public static nt a(dfy $$0) {
      return new nt($$0);
   }

   public nt a(List<nx> $$0) {
      this.b.add(new nt.b($$0));
      return this;
   }

   public nt a(nx $$0) {
      return this.a(ImmutableList.of($$0));
   }

   public nt a(ns $$0, List<nx> $$1) {
      this.b.add(new nt.a($$0, $$1));
      return this;
   }

   public nt a(ns $$0, nx... $$1) {
      return this.a($$0, ImmutableList.copyOf($$1));
   }

   public nt a(ns $$0, nx $$1) {
      return this.a($$0, ImmutableList.of($$1));
   }

   public JsonElement b() {
      dtd<dfy, dtc> $$0 = this.a.l();
      this.b.forEach($$1x -> $$1x.a($$0));
      JsonArray $$1 = new JsonArray();
      this.b.stream().map(nt.b::a).forEach($$1::add);
      JsonObject $$2 = new JsonObject();
      $$2.add("multipart", $$1);
      return $$2;
   }

   static class a extends nt.b {
      private final ns a;

      a(ns $$0, List<nx> $$1) {
         super($$1);
         this.a = $$0;
      }

      @Override
      public void a(dtd<?, ?> $$0) {
         this.a.a($$0);
      }

      @Override
      public void a(JsonObject $$0) {
         $$0.add("when", this.a.get());
      }
   }

   static class b implements Supplier<JsonElement> {
      private final List<nx> a;

      b(List<nx> $$0) {
         this.a = $$0;
      }

      public void a(dtd<?, ?> $$0) {
      }

      public void a(JsonObject $$0) {
      }

      public JsonElement a() {
         JsonObject $$0 = new JsonObject();
         this.a($$0);
         $$0.add("apply", nx.a(this.a));
         return $$0;
      }
   }
}
