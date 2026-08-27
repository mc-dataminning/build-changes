import com.mojang.brigadier.context.StringRange;
import com.mojang.brigadier.suggestion.Suggestion;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.List;

public class yl implements wb<xu> {
   private final int a;
   private final Suggestions b;

   public yl(int $$0, Suggestions $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public yl(tl $$0) {
      this.a = $$0.n();
      int $$1 = $$0.n();
      int $$2 = $$0.n();
      StringRange $$3 = StringRange.between($$1, $$1 + $$2);
      List<Suggestion> $$4 = $$0.a((tl.a<Suggestion>)($$1x -> {
         String $$2x = $$1x.s();
         ui $$3x = $$1x.c(tl::m);
         return new Suggestion($$3, $$2x, $$3x);
      }));
      this.b = new Suggestions($$3, $$4);
   }

   @Override
   public void a(tl $$0) {
      $$0.c(this.a);
      $$0.c(this.b.getRange().getStart());
      $$0.c(this.b.getRange().getLength());
      $$0.a(this.b.getList(), ($$0x, $$1) -> {
         $$0x.a($$1.getText());
         $$0x.a($$1.getTooltip(), ($$0xx, $$1x) -> $$0xx.a(ul.a($$1x)));
      });
   }

   public void a(xu $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public Suggestions d() {
      return this.b;
   }
}
