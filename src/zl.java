import javax.annotation.Nullable;

public class zl implements vf<wy> {
   @Nullable
   private final aey a;

   public zl(@Nullable aey $$0) {
      this.a = $$0;
   }

   public void a(wy $$0) {
      $$0.a(this);
   }

   public zl(sq $$0) {
      this.a = $$0.c(sq::s);
   }

   @Override
   public void a(sq $$0) {
      $$0.a(this.a, sq::a);
   }

   @Nullable
   public aey a() {
      return this.a;
   }
}
